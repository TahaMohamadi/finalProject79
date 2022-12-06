package ir.mohammadi.service.Suggestion.impl;

import ir.mohammadi.base.service.impl.BaseServiceImpl;
import ir.mohammadi.entity.Suggestion;
import ir.mohammadi.repository.Suggestion.SuggestionRepo;
import ir.mohammadi.service.Suggestion.SuggestionServ;

public class SuggestionServImpl extends BaseServiceImpl<Suggestion, SuggestionRepo> implements SuggestionServ {
    public SuggestionServImpl(SuggestionRepo repository) {
        super(repository);
    }
}
