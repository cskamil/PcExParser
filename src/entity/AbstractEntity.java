package entity;

import java.util.UUID;

public class AbstractEntity {
	
	private String id;
	
	public AbstractEntity() {
		this.id = UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		AbstractEntity entity = (AbstractEntity)obj;
		return entity.getId().equals(getId());
	}
}
