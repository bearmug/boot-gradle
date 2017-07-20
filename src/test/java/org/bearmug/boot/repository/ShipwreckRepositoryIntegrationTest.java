package org.bearmug.boot.repository;

import org.bearmug.boot.model.Shipwreck;
import org.bearmug.boot.reposotiry.ShipwreckRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ShipwreckRepositoryIntegrationTest {

    @Autowired
    private ShipwreckRepository repo;

    @Test
    public void findAll() {
        List<Shipwreck> shipwrecks = repo.findAll();
        assertThat(shipwrecks.size(), is(greaterThanOrEqualTo(0)));
    }
}
