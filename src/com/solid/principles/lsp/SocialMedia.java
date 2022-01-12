package com.solid.principles.lsp;

/*
 * Liskov Substitution Principle
 *   It applies to inheritance in such a way that the derived class must be completely substitutable for
 *   their base classes. In other words, if classA is a subtype of classB, then we should be able to replace
 *   B with A without interrupting the behavior of the program.
 */
public abstract class SocialMedia {

    //@support WhatsApp,Facebook,Instagram
    public abstract void chatWithFriend();

    //@support Facebook,Instagram
    public abstract void publishPost(Object post);

    //@support WhatsApp,Facebook,Instagram
    public abstract void sendPhotosAndVideos();

    //@support WhatsApp,Facebook
    public abstract void groupVideoCall(String... users);

}

