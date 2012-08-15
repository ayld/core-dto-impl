package net.ayld.core.dto;

import java.io.Serializable;

public abstract class BaseDto<I extends Serializable> implements Dto<I>{

	private I id;
	
	@Override
	public I getId() {
		return id;
	}

	public void setId(I id) {
		this.id = id;
	}
}
