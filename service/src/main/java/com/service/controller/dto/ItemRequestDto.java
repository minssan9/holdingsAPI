package com.service.controller.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Data
@NoArgsConstructor
public class ItemRequestDto {

    MultipartFile files;
}
