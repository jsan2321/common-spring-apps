package com.app.mapstruct.mapper;

import com.app.mapstruct.dto.PersonCustomDTO;
import com.app.mapstruct.dto.PersonDefaultDTO;
import com.app.mapstruct.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {
    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    PersonDefaultDTO personToPersonDefaultDTO(Person person);

    @Mapping(source = "id", target = "idDTO")
    @Mapping(source = "name", target = "nameDTO")
    @Mapping(source = "lastName", target = "lastNameDTO")
    @Mapping(source = "email", target = "emailDTO")
    @Mapping(source = "age", target = "ageDTO")
    @Mapping(source = "gender", target = "genderDTO")
    PersonCustomDTO personToPersonCustomDTO(Person person);
}