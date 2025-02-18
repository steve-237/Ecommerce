package de.sweetpeakdesign.com.order.infrastructure.secondary.repository;

import de.sweetpeakdesign.com.order.infrastructure.secondary.entity.OrderedProductEntity;
import de.sweetpeakdesign.com.order.infrastructure.secondary.entity.OrderedProductEntityPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaOrderedProductRepository extends JpaRepository<OrderedProductEntity, OrderedProductEntityPk> {

}
