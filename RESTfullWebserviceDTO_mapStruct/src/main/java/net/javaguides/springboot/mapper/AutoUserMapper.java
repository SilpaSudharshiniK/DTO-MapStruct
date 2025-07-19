package net.javaguides.springboot.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import net.javaguides.springboot.dto.UserDto;
import net.javaguides.springboot.entity.User;

@Mapper
public interface AutoUserMapper {
	
    //implementation of this interface needs a class to implement instead we use below
	AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);
	
	//fields in User and UserDto should be same if not @Mapping is used to specify them
	
	@Mapping(source="email",target="emailAddress")
	UserDto mapToUserDto(User user);
	User mapToUser(UserDto userDto);
}
