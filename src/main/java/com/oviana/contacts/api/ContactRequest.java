package com.oviana.contacts.api;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class ContactRequest {

	private Long id;

	@NotNull(message = "El nombre es requerido")
	@Size(min = 2, max = 30, message = "El nombre debe tener entre {min} y {max} caracteres")
	private String firstName;
	private String lastName;

	@Pattern(regexp = "^\\+[0-9]*$", message = "El n�mero de telefono s�lo puede tener d�gitos iniciando con el s�mbolo +")
	private String phoneNumber;
	private String email;
}
