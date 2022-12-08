package ir.mohammadi.service.Validation;

import ir.mohammadi.entity.Images;

import java.awt.*;
import java.io.File;

public interface ValidationServ {
    boolean validationPassword(String password);
    boolean checkEmail(String email);
    boolean validationUsername(String username);
    boolean checkImageSize(File image);
    boolean checkJPEG(Images image);
}
