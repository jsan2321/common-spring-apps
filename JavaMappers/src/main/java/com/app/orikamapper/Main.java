package com.app.orikamapper;

import com.app.orikamapper.dto.PersonCustomDTO;
import com.app.orikamapper.entities.Person;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class Main {

    /* Orika Mapper - Default */
    /* public static void main(String[] args) {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.classMap(Person.class, PersonDefaultDTO.class); // mapping from Person to PersonDefaultDTO

        MapperFacade mapper = mapperFactory.getMapperFacade();

        Person personEntity = new Person(1L, "Santiago", "Perez", "santy@mail.com", (byte) 25, 'M');
        System.out.println(personEntity);

        PersonDefaultDTO personDefaultDTO = mapper.map(personEntity, PersonDefaultDTO.class);
        System.out.println(personDefaultDTO);
    } */

    /* Orika Mapper - Custom */
    public static void main(String[] args) {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.classMap(Person.class, PersonCustomDTO.class)
                .field("id", "idDTO")
                .field("name", "nameDTO")
                .field("lastName", "lastNameDTO")
                .field("email", "emailDTO")
                .field("age", "ageDTO")
                .field("gender", "genderDTO")
                .byDefault()
                .register();

        MapperFacade mapper = mapperFactory.getMapperFacade();

        Person personEntity = new Person(1L, "Santiago", "Perez", "santy@mail.com", (byte) 25, 'M');
        System.out.println(personEntity);

        PersonCustomDTO personCustomDTO = mapper.map(personEntity, PersonCustomDTO.class);
        System.out.println(personCustomDTO);
    }
}