package org.bearmug.boot.controller;

import org.bearmug.boot.model.Shipwreck;
import org.bearmug.boot.reposotiry.ShipwreckRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ShipwreckControllerTest {

    @InjectMocks
    private ShipwreckController controller;

    @Mock
    private ShipwreckRepository shipwreckRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testShipwreckGet() {
        Shipwreck sh = new Shipwreck();
        sh.setId(1L);
        when(shipwreckRepository.findOne(1L)).thenReturn(sh);

        Shipwreck shipwreck = controller.get(1L);

        verify(shipwreckRepository).findOne(1L);

        assertEquals(1L, shipwreck.getId().longValue());
    }
}
