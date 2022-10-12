package batang.common.entity;

import batang.common.domain.Domain;

import java.util.LinkedList;
import java.util.List;

public class DomainBuilder<D extends Domain, E extends Entity<D>>
{
	public List<D> entities2Domains(List<E> entities)
	{
		if (entities == null)
		{
			return null;
		}
		
		List<D> result = new LinkedList<D>();
		for (E item : entities)
		{
			result.add(item.buildDomain());
		}
		
		return result;
	}
	
	
	public D entity2Domain(E entity)
	{
		if (entity == null)
		{
			return null;
		}
		
		return entity.buildDomain();
	}
	
}
