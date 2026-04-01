class Instagram extends socialMedia implements StoryFeature {
    @Override
    public void chat() { System.out.println("Chatting on IG..."); }

    @Override
    public void postStory() { System.out.println("Story posted to IG!"); }
}