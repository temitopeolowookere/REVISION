package practice.examples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PhoneNumberValidatorTest {

     private PhoneNumberValidator underTest;

    @BeforeEach
    void startWithThis(){
        underTest = new PhoneNumberValidator();
    }
    @Test
    void itShouldValidatePhoneNumber(){
        //given
        String phoneNumber = "07039361743";

        //when
      boolean isValid = underTest.Test(phoneNumber);
        //assert



    }

}