package com.semih.monolithicarchitecture.mapper;

import com.semih.monolithicarchitecture.dto.request.ProductSaveRequestDto;
import com.semih.monolithicarchitecture.repository.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    /**
     * UrunSaveRequestDto yu Urun e dönüştürmek istiyoruz.
     * Alınacak bilgi: Dto
     * Çıktılanacak bilgi: Urun
     */
    Product toProduct(ProductSaveRequestDto dto);

    ProductSaveRequestDto fromProduct(Product product);
}
