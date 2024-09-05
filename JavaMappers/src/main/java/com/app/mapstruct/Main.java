package com.app.mapstruct;

import com.app.mapstruct.dto.PersonCustomDTO;
import com.app.mapstruct.entities.Person;
import com.app.mapstruct.mapper.PersonMapper;

public class Main {

    /* MapStruct - Default */
    /* public static void main(String[] args) {
        Person personEntity = new Person(1L, "Santiago", "Perez", "santy@mail.com", (byte) 25, 'M');
        System.out.println(personEntity);

        PersonDefaultDTO personDefaultDTO = PersonMapper.INSTANCE.personToPersonDefaultDTO(personEntity);
        System.out.println(personDefaultDTO);
    } */

    /* MapStruct - Custom */
    public static void main(String[] args) {
        Person personEntity = new Person(1L, "Santiago", "Perez", "santy@mail.com", (byte) 25, 'M');
        System.out.println(personEntity);

        PersonCustomDTO personCustomDTO = PersonMapper.INSTANCE.personToPersonCustomDTO(personEntity);
        System.out.println(personCustomDTO);
    }
}