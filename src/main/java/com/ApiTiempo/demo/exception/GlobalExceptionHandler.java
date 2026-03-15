/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ApiTiempo.demo.exception;

import com.ApiTiempo.demo.dto.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> handleGenericException(Exception ex) {
        ErrorResponse error = new ErrorResponse(
                HttpStatus.INTERNAL_SERVER_ERROR.value(), // 500
                "Error interno del servidor",
                "Ha ocurrido un error inesperado. Inténtalo más tarde."
        );

        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(HttpClientErrorException.NotFound.class)
    public ResponseEntity<ErrorResponse> handleNotFound(HttpClientErrorException.NotFound ex) {

        ErrorResponse error = new ErrorResponse(HttpStatus.NOT_FOUND.value(),//404
                "Ciudad no encontrada",
                "La ciudad no existe"
        );

        return new ResponseEntity(error, HttpStatus.NOT_FOUND);

    }
}
