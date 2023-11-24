package WebTestRangiffler;

import com.codeborne.selenide.Selenide;
import org.checkerframework.checker.units.qual.K;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.input.model.MouseButton;

import javax.annotation.concurrent.ThreadSafe;
import java.awt.event.MouseAdapter;

public class WebTest {

    @BeforeAll
    static void setUp() {
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
    }
    @Test
    public void signUpTest(){
        Selenide.open("http://127.0.0.1:9000/register");
        Selenide.$("[name=username]").setValue("Check12345");
        Selenide.$("[id=password]").setValue("12345");
        Selenide.$("[id=passwordSubmit]").setValue("12345").press("Sign up!");
    }

    @Test
    public void signInTest(){
        Selenide.open("http://127.0.0.1:9000/login");
        Selenide.$("[name=username]").setValue("Check1234");
        Selenide.$("[name=password]").setValue("1234").press("Sign in");
        Selenide.open("http://127.0.0.1/landing");
    }
    @Test
    public void clickSignUp(){
        Selenide.open("http://127.0.0.1:9000/login");
        Selenide.$(Selenide.$x("/html/body/main/form/p/a")).press("[Sign up!]");
    }

    @Test
    public void addPhotoButtonTest() throws InterruptedException {
        Selenide.open("http://127.0.0.1");
        Selenide.$x("/html/body/div/div/div/div/div/div/div[3]/div/a[1]").press(Keys.DOWN).click();
        Selenide.$("[name=username]").setValue("Check1234");
        Selenide.$("[name=password]").setValue("1234").pressEnter();
        Selenide.$x("/html/body/div/div/header/div/div/button").press(Keys.DOWN).click();
        //Selenide.open("http://127.0.0.1/landing");
        //Selenide.$("[test-id=add-travel]").press("[Add photo]");
    }
    @Test
    public void userProfileButton() {
        Selenide.open("http://127.0.0.1");
        Selenide.$x("/html/body/div/div/div/div/div/div/div[3]/div/a[1]").press(Keys.DOWN).click();
        Selenide.$("[name=username]").setValue("Check1234");
        Selenide.$("[name=password]").setValue("1234").pressEnter();
        Selenide.$("[test-id=\"user-profile-btn\"]").click();
        //Selenide.$x("/html/body/div/div/header/div/div/div/div[1]").press("[test-id-user-profile-btn]");
    }
    @Test
    public void zoomPlusTest(){
        Selenide.open("http://127.0.0.1");
        Selenide.$x("/html/body/div/div/div/div/div/div/div[3]/div/a[1]").press(Keys.DOWN).click();
        Selenide.$("[name=username]").setValue("Check1234");
        Selenide.$("[name=password]").setValue("1234").pressEnter();
        Selenide.$("[aria-label=\"Zoom in\"]").click();
    }
    @Test
    public void zoomMinusTest(){
        Selenide.open("http://127.0.0.1");
        Selenide.$x("/html/body/div/div/div/div/div/div/div[3]/div/a[1]").press(Keys.DOWN).click();
        Selenide.$("[name=username]").setValue("Check1234");
        Selenide.$("[name=password]").setValue("1234").pressEnter();
        Selenide.$("[aria-label=\"Zoom in\"]").click();
        Selenide.$("[aria-label=\"Zoom out\"]").click();
    }
    @Test
    public void friendsMapTest(){
        Selenide.open("http://127.0.0.1");
        Selenide.$x("/html/body/div/div/div/div/div/div/div[3]/div/a[1]").press(Keys.DOWN).click();
        Selenide.$("[name=username]").setValue("Check1234");
        Selenide.$("[name=password]").setValue("1234").pressEnter();
        Selenide.$("[test-id=\"friends-travels\"]").click();
    }
    @Test
    public void friendsZoomPlusTest() {
        Selenide.open("http://127.0.0.1");
        Selenide.$x("/html/body/div/div/div/div/div/div/div[3]/div/a[1]").press(Keys.DOWN).click();
        Selenide.$("[name=username]").setValue("Check1234");
        Selenide.$("[name=password]").setValue("1234").pressEnter();
        Selenide.$("[test-id=\"friends-travels\"]").click();
        Selenide.$("[aria-label=\"Zoom in\"]").click();
    }
    @Test
    public void FriendsZoomMinusTest(){
        Selenide.open("http://127.0.0.1");
        Selenide.$x("/html/body/div/div/div/div/div/div/div[3]/div/a[1]").press(Keys.DOWN).click();
        Selenide.$("[name=username]").setValue("Check1234");
        Selenide.$("[name=password]").setValue("1234").pressEnter();
        Selenide.$("[test-id=\"friends-travels\"]").click();
        Selenide.$("[aria-label=\"Zoom in\"]").click();
        Selenide.$("[aria-label=\"Zoom out\"]").click();
    }
    @Test
    public void peopleAroundTest(){
        Selenide.open("http://127.0.0.1");
        Selenide.$x("/html/body/div/div/div/div/div/div/div[3]/div/a[1]").press(Keys.DOWN).click();
        Selenide.$("[name=username]").setValue("Check1234");
        Selenide.$("[name=password]").setValue("1234").pressEnter();
        Selenide.$("[test-id=\"people-around\"]").click();
    }
    @Test
    public void addFriendTest(){
        Selenide.open("http://127.0.0.1");
        Selenide.$x("/html/body/div/div/div/div/div/div/div[3]/div/a[1]").press(Keys.DOWN).click();
        Selenide.$("[name=username]").setValue("Check1234");
        Selenide.$("[name=password]").setValue("1234").pressEnter();
        Selenide.$("[test-id=\"people-around\"]").click();
        Selenide.$("[aria-label=\"Add friend\"]").click();
    }
    @Test
    public void addFriendAcceptTest(){
        Selenide.open("http://127.0.0.1");
        Selenide.$x("/html/body/div/div/div/div/div/div/div[3]/div/a[1]").press(Keys.DOWN).click();
        Selenide.$("[name=username]").setValue("Check123");
        Selenide.$("[name=password]").setValue("1234").pressEnter();
        Selenide.$("[test-id=\"people-around\"]").click();
        Selenide.$("[aria-label=\"Accept invitation\"]").click();
    }
    @Test
    public void declineFriendAcceptTest(){
        Selenide.open("http://127.0.0.1");
        Selenide.$x("/html/body/div/div/div/div/div/div/div[3]/div/a[1]").press(Keys.DOWN).click();
        Selenide.$("[name=username]").setValue("Check1234");
        Selenide.$("[name=password]").setValue("1234").pressEnter();
        Selenide.$("[test-id=\"people-around\"]").click();
        Selenide.$("[aria-label=\"Desline invitation\"]").click();
    }
    @Test
    public void removeFriendTest(){
        Selenide.open("http://127.0.0.1");
        Selenide.$x("/html/body/div/div/div/div/div/div/div[3]/div/a[1]").press(Keys.DOWN).click();
        Selenide.$("[name=username]").setValue("Check123");
        Selenide.$("[name=password]").setValue("1234").pressEnter();
        Selenide.$("[test-id=\"people-around\"]").click();
        Selenide.$("[aria-label=\"Remove friend\"]").click();
    }
    @Test
    public void deleteFriendTest(){
        Selenide.open("http://127.0.0.1");
        Selenide.$x("/html/body/div/div/div/div/div/div/div[3]/div/a[1]").press(Keys.DOWN).click();
        Selenide.$("[name=username]").setValue("Check123");
        Selenide.$("[name=password]").setValue("1234").pressEnter();
        Selenide.$("[test-id=\"people-around\"]").click();
        Selenide.$("[aria-label=\"Remove friend\"]").click();
        Selenide.$("[id=\":r7:\"").click();
    }
    @Test
    public void friendsListTest(){
        Selenide.open("http://127.0.0.1");
        Selenide.$x("/html/body/div/div/div/div/div/div/div[3]/div/a[1]").press(Keys.DOWN).click();
        Selenide.$("[name=username]").setValue("Check1234");
        Selenide.$("[name=password]").setValue("1234").pressEnter();
        Selenide.$("[aria-label=\"Your friends\"]").click();
    }
}
