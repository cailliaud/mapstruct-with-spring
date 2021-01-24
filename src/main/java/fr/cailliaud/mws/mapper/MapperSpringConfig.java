package fr.cailliaud.mws.mapper;

import org.mapstruct.MapperConfig;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.extensions.spring.SpringMapperConfig;

@MapperConfig(
    componentModel = "spring",
    unmappedTargetPolicy = ReportingPolicy.ERROR,
    uses = ConversionServiceAdapter.class)
@SpringMapperConfig(conversionServiceAdapterPackage = "fr.cailliaud.mws.mapper")
public interface MapperSpringConfig {}
