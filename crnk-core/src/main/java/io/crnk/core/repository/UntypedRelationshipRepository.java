package io.crnk.core.repository;

import java.io.Serializable;

/**
 * @Deprecated make use of RelationshipRepository.getMatcher()
 */
@Deprecated
public interface UntypedRelationshipRepository<T, I extends Serializable, D, J extends Serializable>
		extends RelationshipRepository<T, I, D, J> {

	String getSourceResourceType();

	String getTargetResourceType();

}