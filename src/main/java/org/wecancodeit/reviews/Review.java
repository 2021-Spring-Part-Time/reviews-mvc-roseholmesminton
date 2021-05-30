package org.wecancodeit.reviews;

public class Review {
    private Long id;
    private String title;
    private String image;
    private String nickname;
    private String reviewCategory;
    private String content;
    private String nationality;
    private String loveInterests;
    private String weaponsOfChoice;
    private String fightingStyles;
    private String specialSkill;


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getNickname() {
        return nickname;
    }

    public String getReviewCategory() {
        return reviewCategory;
    }

    public String getContent() {
        return content;
    }

    public String getNationality() {
        return nationality;
    }

    public String getLoveInterests() {
        return loveInterests;
    }

    public String getWeaponsOfChoice() {
        return weaponsOfChoice;
    }

    public String getFightingStyles() {
        return fightingStyles;
    }

    public String getSpecialSkill() {
        return specialSkill;
    }

    public Review(Long id, String title, String image, String nickname, String reviewCategory, String content, String nationality, String loveInterests, String weaponsOfChoice, String fightingStyles, String specialSkill) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.nickname = nickname;
        this.reviewCategory = reviewCategory;
        this.content = content;
        this.nationality = nationality;
        this.loveInterests = loveInterests;
        this.weaponsOfChoice = weaponsOfChoice;
        this.fightingStyles = fightingStyles;
        this.specialSkill= specialSkill;
    }
}
