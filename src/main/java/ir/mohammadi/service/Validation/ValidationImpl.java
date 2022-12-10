package ir.mohammadi.service.Validation;

import ir.mohammadi.entity.Images;
import ir.mohammadi.repository.UserAccount.impl.UserAccountRepoImpl;
import ir.mohammadi.service.UserAccount.UserAccountServ;
import ir.mohammadi.service.UserAccount.impl.UserAccountServImpl;
import ir.mohammadi.util.Hibernate;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

public class
ValidationImpl implements ValidationServ{
    UserAccountServ userAccountServ = new UserAccountServImpl(new UserAccountRepoImpl(Hibernate.getEntityManagerFactory().createEntityManager()));
//    validate password
    @Override
    public boolean validationPassword(String password) {
        return Pattern
                .compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8}$")
                .matcher(password)
                .matches();
    }

    @Override
    public boolean checkEmail(String email) {
        return Pattern
                .compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")
                .matcher(email)
                .matches();
    }

    @Override
    public boolean validationUsername(String username) {
        return ((Pattern
                .compile("^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$")
                .matcher(username)
                .matches()) && (userAccountServ.CheckUsername(username)) );
    }



    @Override
    public boolean checkImageSize(File image) {
        BufferedImage images;

        try {
            images = ImageIO.read(new java.io.File(image.toPath().toString()));
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
            Long size =  image.length();
        if (size < 300000){
            return true;
        } else {
            return false;
        }

    }

    public boolean checkJPEG(Images image) {
        String fileName = image.getName().toString().toUpperCase();
        return fileName.endsWith(".JPG") || fileName.endsWith(".JPEG");
    }
}
