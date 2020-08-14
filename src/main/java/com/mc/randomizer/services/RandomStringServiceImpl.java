package com.mc.randomizer.services;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Random;

//To register in the context as a Spring bean & can be found during classpath scanning
@Component
public class RandomStringServiceImpl implements RandomStringService {

    //HashSet<String> genartedStrings=new HashSet();
    //(If we want to remove the duplicate generted number then we can enable the Set implemenation code )
    /* Instead of writing the complete custom code we can use APache libraray function as well
              RandomStringUtils.randomAlphanumeric(Size);
     */

    @Override
    public String getRandomString(Integer size) {
        /* Added small case as well . If we want to avoid collision in generated code then this will help .
         But at the sametime to remove collision , we need to use Set where every generated string we
          will store as Key and we can keep on removing the first genarted code whne set is full (Similiar to what we do in Cache)
         */
        String ALPHANUM123 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJMNOPQRSTUVWXYZ123456790";
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        while (sb.length() < size) {
            int index = (int) (new Random().nextFloat() * ALPHANUM123.length());
            sb.append(ALPHANUM123.charAt(index));
        }
        String s = sb.toString();
        // To avoide duplicate /Collision we can enable this code

        /*if(!genartedStrings.contains(s))
            genartedStrings.add(s);
        else
            getRandomString(size);
            */
        return s;
    }
}
