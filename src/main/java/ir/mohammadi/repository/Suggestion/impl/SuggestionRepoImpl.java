package ir.mohammadi.repository.Suggestion.impl;

import ir.mohammadi.base.repository.impl.BaseRepositoryImpl;
import ir.mohammadi.entity.Suggestion;
import ir.mohammadi.repository.Suggestion.SuggestionRepo;
import jakarta.persistence.EntityManager;

public class SuggestionRepoImpl extends BaseRepositoryImpl<Suggestion> implements SuggestionRepo {
    public SuggestionRepoImpl(EntityManager em) {
        super(em);
    }

    @Override
    public Class<Suggestion> getEntityClass() {
        return Suggestion.class;
    }
}
