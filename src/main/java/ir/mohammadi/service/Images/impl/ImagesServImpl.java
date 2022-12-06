package ir.mohammadi.service.Images.impl;

import ir.mohammadi.base.service.impl.BaseServiceImpl;
import ir.mohammadi.entity.Images;
import ir.mohammadi.repository.Images.ImagesRepo;
import ir.mohammadi.service.Images.ImagesServ;

public class ImagesServImpl extends BaseServiceImpl<Images, ImagesRepo> implements ImagesServ {
    public ImagesServImpl(ImagesRepo repository) {
        super(repository);
    }
}
