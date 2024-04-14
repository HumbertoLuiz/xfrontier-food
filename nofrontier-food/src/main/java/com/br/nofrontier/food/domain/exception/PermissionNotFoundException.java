package com.br.nofrontier.food.domain.exception;

public class PermissionNotFoundException extends EntityNotFoundException {

	private static final long serialVersionUID = 1L;

	public PermissionNotFoundException(String message) {
		super(message);
	}

	public PermissionNotFoundException(Long permissionId) {
		this(String.format("There is no permission register with a code %d", permissionId));
	}

}
