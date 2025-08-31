package com.example.profiles;

/**
 * Mutable and confusing. Multiple constructors + setters.
 */
public final class UserProfile {
    private final String id;
    private final String email;
    private final String phone;
    private final String displayName;
    private final String address;
    private final boolean marketingOptIn;
    private final String twitter;
    private final String github;

    // public UserProfile() { }

    // public UserProfile(String id, String email) {
    //     this.id = id;
    //     this.email = email;
    // }

    public UserProfile(Builder b) {
        this.id = b.id;
        this.email = b.email;
        this.displayName = b.displayName;
        this.address = b.address;
        this.marketingOptIn = b.marketingOptIn;
        this.twitter = b.twitter;
        this.github = b.github;
        this.phone = b.phone;
    }
    public static class Builder {
        private String id;
        private String email;
        private String phone;
        private String displayName;
        private String address;
        private boolean marketingOptIn;
        private String twitter;
        private String github;

        public Builder setId(String id) { this.id = id; return this; }
        public Builder setEmail(String email) { this.email = email; return this; }
        public Builder setPhone(String phone) { this.phone = phone; return this; }
        public Builder setDisplayName(String displayName) { this.displayName = displayName; return this; }
        public Builder setAddress(String address) { this.address = address; return this; }
        public Builder setMarketingOptIn(boolean marketingOptIn) { this.marketingOptIn = marketingOptIn; return this; }
        public Builder setTwitter(String twitter) { this.twitter = twitter; return this; }
        public Builder setGithub(String github) { this.github = github; return this; }

        public UserProfile build() {
            // validation
            Validation.requireEmail(email);
            Validation.requireNonBlank(id, "id");
            Validation.requireNonBlank(email, "email");
            if (displayName != null && displayName.length() > 100) {
                throw new IllegalArgumentException("displayName too long");
            }
            return new UserProfile(this);
        }
    }
    // many setters — mutability leaks
    // public void setId(String id) { this.id = id; }
    // public void setEmail(String email) { this.email = email; }
    // public void setPhone(String phone) { this.phone = phone; }
    // public void setDisplayName(String displayName) { this.displayName = displayName; }
    // public void setAddress(String address) { this.address = address; }
    // public void setMarketingOptIn(boolean marketingOptIn) { this.marketingOptIn = marketingOptIn; }
    // public void setTwitter(String twitter) { this.twitter = twitter; }
    // public void setGithub(String github) { this.github = github; }

    // getters
    public String getId() { return id; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getDisplayName() { return displayName; }
    public String getAddress() { return address; }
    public boolean isMarketingOptIn() { return marketingOptIn; }
    public String getTwitter() { return twitter; }
    public String getGithub() { return github; }
}
