package com.chtrembl.petstore.pet.converter;

import com.chtrembl.petstore.pet.model.Pet;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class StatusConverter implements AttributeConverter<Pet.StatusEnum, String> {

    @Override
    public String convertToDatabaseColumn(Pet.StatusEnum attribute) {
        return attribute.getValue();
    }

    @Override
    public Pet.StatusEnum convertToEntityAttribute(String dbData) {
        return Pet.StatusEnum.fromValue(dbData);
    }
}