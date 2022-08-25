package com.inspection.phomble.response;

// Welcome9.java

import java.time.OffsetDateTime;

public class UnsplashResponse {
    private String id;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private OffsetDateTime promotedAt;
    private long width;
    private long height;
    private String color;
    private String blurHash;
    private Object description;
    private Object altDescription;
    private Urls urls;
    private Welcome9Links links;
    private Object[] categories;
    private long likes;
    private boolean likedByUser;
    private Object[] currentUserCollections;
    private Object sponsorship;
    private TopicSubmissions topicSubmissions;
    private User user;
    private Exif exif;
    private Location location;
    private long views;
    private long downloads;

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public OffsetDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(OffsetDateTime value) { this.createdAt = value; }

    public OffsetDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(OffsetDateTime value) { this.updatedAt = value; }

    public OffsetDateTime getPromotedAt() { return promotedAt; }
    public void setPromotedAt(OffsetDateTime value) { this.promotedAt = value; }

    public long getWidth() { return width; }
    public void setWidth(long value) { this.width = value; }

    public long getHeight() { return height; }
    public void setHeight(long value) { this.height = value; }

    public String getColor() { return color; }
    public void setColor(String value) { this.color = value; }

    public String getBlurHash() { return blurHash; }
    public void setBlurHash(String value) { this.blurHash = value; }

    public Object getDescription() { return description; }
    public void setDescription(Object value) { this.description = value; }

    public Object getAltDescription() { return altDescription; }
    public void setAltDescription(Object value) { this.altDescription = value; }

    public Urls getUrls() { return urls; }
    public void setUrls(Urls value) { this.urls = value; }

    public Welcome9Links getLinks() { return links; }
    public void setLinks(Welcome9Links value) { this.links = value; }

    public Object[] getCategories() { return categories; }
    public void setCategories(Object[] value) { this.categories = value; }

    public long getLikes() { return likes; }
    public void setLikes(long value) { this.likes = value; }

    public boolean getLikedByUser() { return likedByUser; }
    public void setLikedByUser(boolean value) { this.likedByUser = value; }

    public Object[] getCurrentUserCollections() { return currentUserCollections; }
    public void setCurrentUserCollections(Object[] value) { this.currentUserCollections = value; }

    public Object getSponsorship() { return sponsorship; }
    public void setSponsorship(Object value) { this.sponsorship = value; }

    public TopicSubmissions getTopicSubmissions() { return topicSubmissions; }
    public void setTopicSubmissions(TopicSubmissions value) { this.topicSubmissions = value; }

    public User getUser() { return user; }
    public void setUser(User value) { this.user = value; }

    public Exif getExif() { return exif; }
    public void setExif(Exif value) { this.exif = value; }

    public Location getLocation() { return location; }
    public void setLocation(Location value) { this.location = value; }

    public long getViews() { return views; }
    public void setViews(long value) { this.views = value; }

    public long getDownloads() { return downloads; }
    public void setDownloads(long value) { this.downloads = value; }
}

// Exif.java

class Exif {
    private String make;
    private String model;
    private String name;
    private String exposureTime;
    private String aperture;
    private String focalLength;
    private long iso;

    public String getMake() { return make; }
    public void setMake(String value) { this.make = value; }

    public String getModel() { return model; }
    public void setModel(String value) { this.model = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getExposureTime() { return exposureTime; }
    public void setExposureTime(String value) { this.exposureTime = value; }

    public String getAperture() { return aperture; }
    public void setAperture(String value) { this.aperture = value; }

    public String getFocalLength() { return focalLength; }
    public void setFocalLength(String value) { this.focalLength = value; }

    public long getISO() { return iso; }
    public void setISO(long value) { this.iso = value; }
}

// Welcome9Links.java



class Welcome9Links {
    private String self;
    private String html;
    private String download;
    private String downloadLocation;

    public String getSelf() { return self; }
    public void setSelf(String value) { this.self = value; }

    public String getHTML() { return html; }
    public void setHTML(String value) { this.html = value; }

    public String getDownload() { return download; }
    public void setDownload(String value) { this.download = value; }

    public String getDownloadLocation() { return downloadLocation; }
    public void setDownloadLocation(String value) { this.downloadLocation = value; }
}

// Location.java



class Location {
    private String title;
    private String name;
    private Object city;
    private String country;
    private Position position;

    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public Object getCity() { return city; }
    public void setCity(Object value) { this.city = value; }

    public String getCountry() { return country; }
    public void setCountry(String value) { this.country = value; }

    public Position getPosition() { return position; }
    public void setPosition(Position value) { this.position = value; }
}

// Position.java



class Position {
    private double latitude;
    private double longitude;

    public double getLatitude() { return latitude; }
    public void setLatitude(double value) { this.latitude = value; }

    public double getLongitude() { return longitude; }
    public void setLongitude(double value) { this.longitude = value; }
}

// TopicSubmissions.java



class TopicSubmissions {
}

// Urls.java



class Urls {
    private String raw;
    private String full;
    private String regular;
    private String small;
    private String thumb;
    private String smallS3;

    public String getRaw() { return raw; }
    public void setRaw(String value) { this.raw = value; }

    public String getFull() { return full; }
    public void setFull(String value) { this.full = value; }

    public String getRegular() { return regular; }
    public void setRegular(String value) { this.regular = value; }

    public String getSmall() { return small; }
    public void setSmall(String value) { this.small = value; }

    public String getThumb() { return thumb; }
    public void setThumb(String value) { this.thumb = value; }

    public String getSmallS3() { return smallS3; }
    public void setSmallS3(String value) { this.smallS3 = value; }
}

// User.java

class User {
    private String id;
    private OffsetDateTime updatedAt;
    private String username;
    private String name;
    private String firstName;
    private String lastName;
    private String twitterUsername;
    private String portfolioURL;
    private String bio;
    private String location;
    private UserLinks links;
    private ProfileImage profileImage;
    private String instagramUsername;
    private long totalCollections;
    private long totalLikes;
    private long totalPhotos;
    private boolean acceptedTos;
    private boolean forHire;
    private Social social;

    public String getID() { return id; }
    public void setID(String value) { this.id = value; }

    public OffsetDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(OffsetDateTime value) { this.updatedAt = value; }

    public String getUsername() { return username; }
    public void setUsername(String value) { this.username = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String value) { this.firstName = value; }

    public String getLastName() { return lastName; }
    public void setLastName(String value) { this.lastName = value; }

    public String getTwitterUsername() { return twitterUsername; }
    public void setTwitterUsername(String value) { this.twitterUsername = value; }

    public String getPortfolioURL() { return portfolioURL; }
    public void setPortfolioURL(String value) { this.portfolioURL = value; }

    public String getBio() { return bio; }
    public void setBio(String value) { this.bio = value; }

    public String getLocation() { return location; }
    public void setLocation(String value) { this.location = value; }

    public UserLinks getLinks() { return links; }
    public void setLinks(UserLinks value) { this.links = value; }

    public ProfileImage getProfileImage() { return profileImage; }
    public void setProfileImage(ProfileImage value) { this.profileImage = value; }

    public String getInstagramUsername() { return instagramUsername; }
    public void setInstagramUsername(String value) { this.instagramUsername = value; }

    public long getTotalCollections() { return totalCollections; }
    public void setTotalCollections(long value) { this.totalCollections = value; }

    public long getTotalLikes() { return totalLikes; }
    public void setTotalLikes(long value) { this.totalLikes = value; }

    public long getTotalPhotos() { return totalPhotos; }
    public void setTotalPhotos(long value) { this.totalPhotos = value; }

    public boolean getAcceptedTos() { return acceptedTos; }
    public void setAcceptedTos(boolean value) { this.acceptedTos = value; }

    public boolean getForHire() { return forHire; }
    public void setForHire(boolean value) { this.forHire = value; }

    public Social getSocial() { return social; }
    public void setSocial(Social value) { this.social = value; }
}

// UserLinks.java



class UserLinks {
    private String self;
    private String html;
    private String photos;
    private String likes;
    private String portfolio;
    private String following;
    private String followers;

    public String getSelf() { return self; }
    public void setSelf(String value) { this.self = value; }

    public String getHTML() { return html; }
    public void setHTML(String value) { this.html = value; }

    public String getPhotos() { return photos; }
    public void setPhotos(String value) { this.photos = value; }

    public String getLikes() { return likes; }
    public void setLikes(String value) { this.likes = value; }

    public String getPortfolio() { return portfolio; }
    public void setPortfolio(String value) { this.portfolio = value; }

    public String getFollowing() { return following; }
    public void setFollowing(String value) { this.following = value; }

    public String getFollowers() { return followers; }
    public void setFollowers(String value) { this.followers = value; }
}

// ProfileImage.java



class ProfileImage {
    private String small;
    private String medium;
    private String large;

    public String getSmall() { return small; }
    public void setSmall(String value) { this.small = value; }

    public String getMedium() { return medium; }
    public void setMedium(String value) { this.medium = value; }

    public String getLarge() { return large; }
    public void setLarge(String value) { this.large = value; }
}

// Social.java



class Social {
    private String instagramUsername;
    private String portfolioURL;
    private String twitterUsername;
    private Object paypalEmail;

    public String getInstagramUsername() { return instagramUsername; }
    public void setInstagramUsername(String value) { this.instagramUsername = value; }

    public String getPortfolioURL() { return portfolioURL; }
    public void setPortfolioURL(String value) { this.portfolioURL = value; }

    public String getTwitterUsername() { return twitterUsername; }
    public void setTwitterUsername(String value) { this.twitterUsername = value; }

    public Object getPaypalEmail() { return paypalEmail; }
    public void setPaypalEmail(Object value) { this.paypalEmail = value; }
}
