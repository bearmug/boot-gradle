package org.bearmug.boot.reposotiry;

import org.bearmug.boot.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {

}
