package org.wecancodeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository() {
        Review aang = new Review(1L, "Aang", "/images/Aang.jpg", "Twinkle Toes",
                "The Avatar", "Aang is the Avatar. The Avatar is the reincarnation of the spirit of " +
                "light who’s goal is to maintain balance and peace in the world. The Avatar is the only one who can bend" +
                " all four elements. After running away from home, Aang along side his pet sky bison Appa get frozen in" +
                " an iceberg for 100 years. After Sokka and Katara discover them and free them from the ice, he learns" +
                " that his people have been wiped out by the Fire Nation and that during the time he and Appa were frozen  " +
                "in the iceberg, the Fire Nation had started a century long war. The Fire Nation were terrorizing " +
                "the other nations. Each day they were get closer to completing their goal for worldwide domination" +
                ". Aang must learn how to bend all four elements and stop the Fire Nation by defeating the Fire Lord. " +
                "Aang’s journey is one where he learns to accept a destiny that he never wanted in the first place while " +
                "also being a fun loving kid.",
                "Air Nation", "Katara", "Air, airbending staff",
                "Avatar state, airbending," +
                " waterbending, earthbending, firebending, engerybending", "The bridge between the physical " +
                "world and the spirit world, can remove a person's bending powers");
        Review katara = new Review(2L, "Katara", "/images/Katara.jpg", "Sugar Queen",
                "Waterbender", "Katara is a waterbender from the Southern Water Tribe. The first " +
                "waterbender born in the Southern Tribe in decades. As a child, her mother was murdered by the commander" +
                " of a Fire Nation raid. The Fire Nation was searching the tribe to capture their last waterbender. Katara's mother " +
                "lied and told them she was the last waterbender. She sacrificed her life to spare her daughter. After " +
                "her mother's death, Katara took it upon herself to be the mother of her family, especially toward her" +
                " older brother Sokka. After she and her brother discover Aang in the iceberg, they embark on a journey" +
                "of a lifetime. They help Aang learn how to master the four elements. Along the way, Katara's " +
                "bending abilities improve as well. Katara’s journey is one of inner strength","Water Nation," +
                " Southern Water Tribe", "Jet, Aang", "Water", "Waterbending",
                "Water healing");
        Review sokka = new Review(3L, "Sokka", "/images/Sokka.jpg", "Captain Boomerang",
                "Warrior", "Sokka is the older brother of Katara and a non-bender in Team Avatar. " +
                "After his mother’s death, his father left their tribe to go fight in the war. This made Sokka want to " +
                "become the leader of his tribe. Clumsy, sarcastic and full of humor, Sokka provides most of the comedy " +
                "of the group while also bringing his outside the box thinking and strategies to the table. Sokka’s " +
                "journey is one of becoming a leader.   ", "Water Nation, Southern Water Tribe",
                "Yue, Suki", "Boomerang, machete, dagger, sword", "Warrior style, " +
                "swordsmanship", "Tactician, inventor");
        Review toph = new Review(4L, "Toph Beifong", "/images/Toph.jpg", "The Blind Bandit",
                "Earthbender", "Toph is a blind earthbender. But don’t let her blindness or small " +
                "stature fool you. Her disability is routinely her greatest strength as she’s able to feel parts of the" +
                " earth that other earthbenders can’t feel. Her seismic sense prooves time and time again to be a lethal" +
                " weapon against her opponents. Tough and brash, Toph is the tomboy of the group who runs away from her " +
                "rich upbringing to discover the world while helping Aang master earthbending along the way. " +
                "Toph’s journey is one of learning to trust and of gaining friends.", "Earth Kingdom",
                "Sokka", "Earth", "Earthbending, metalbending",
                "Inventor of metalbending");
        Review suki = new Review(5L, "Suki", "/images/Suki.jpg", "Suki",
                "Kyoshi Warrior", "Suki is the leader of the Kyoshi Warriors. The Kyoshi Warriors, " +
                "named after Avatar Kyoshi, are a group of fan welding fighters stationed on Kyoshi Island. After the " +
                "gang meet the warriors, she teaches Sokka a valuable lesson about not judging girls and decides along " +
                "with the rest of the Warriors to help fight in the war. Suki provides expert martial art abilities to " +
                "the team and is the second non-bender in the group. Suki’s journey is one of respect.",
                "Earth Kingdom", "Sokka", "War fans", "Tessenjutsu",
                "Leader of the Kyoshi Warriors");
        Review zuko = new Review(6L, "Prince Zuko", "/images/Zuko.jpg", "Zuzu",
                "Firebender", "Zuko is the banished prince of the Fire Nation. At the age of 13, " +
                "Prince Zuko's father banished him from the Fire Nation because he spoke out of hand at a war " +
                "planning meeting. As punishment his father burned the left side of his face. Then, his father told him" +
                " he had to find the Avatar. He said that if Zuko could find and capture the Avatar, he would " +
                "restore his honor and he’d be allowed back home. Finding and capturing the Avatar was seemingly " +
                "an impossible mission because no one had seen the Avatar for 100 years. However, Zuko was determined to " +
                "find the Avatar and regain his right to the throne.  When the Avatar is freed from an from " +
                "iceberg by Katara and Sokka, a mysterious light shoots up into the sky and can be seen for miles.  When" +
                " Zuko spots the light beam he goes through a life-changing journey filled with ups and downs on a " +
                "path of self-discovery, leading him to befriend the Avatar. Zuko’s journey is one of finding his " +
                "honor.", "Fire Nation",
                "Mai", "Fire, broadswords", "Firebending",
                "Redirecting lightning");

        reviewList.put(aang.getId(), aang);
        reviewList.put(katara.getId(), katara);
        reviewList.put(sokka.getId(), sokka);
        reviewList.put(toph.getId(), toph);
        reviewList.put(suki.getId(), suki);
        reviewList.put(zuko.getId(), zuko);
    }

    public Review findOne(Long id) {
        return reviewList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewList.values();
    }

    public ReviewRepository(Review... reviewsToAdd) {
        for (Review review : reviewsToAdd) {
           reviewList.put(review.getId(), review);
       }
    }
}
