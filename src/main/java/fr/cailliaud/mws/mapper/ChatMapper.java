package fr.cailliaud.mws.mapper;

import fr.cailliaud.mws.dto.Chat;
import fr.cailliaud.mws.entity.ChatEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ChatMapper {

  Chat mapEntityToDto(ChatEntity chatEntity);
}
