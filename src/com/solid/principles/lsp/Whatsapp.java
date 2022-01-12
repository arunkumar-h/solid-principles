package com.solid.principles.lsp;

//Instagram cannot be substitute for SocialMedia as the implementation publishPost isn't applicable for Instagram,
// but yet it needs to provide empty implement abstract method.
//Thus breaking Liskov Substitution Principle

public class Whatsapp extends SocialMedia {

    public void chatWithFriend() {

    }

    public void publishPost(Object post) {
        //Not applicable
    }

    public void sendPhotosAndVideos() {

    }

    public void groupVideoCall(String... users) {

    }

}
