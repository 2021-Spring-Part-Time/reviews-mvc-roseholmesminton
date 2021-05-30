package org.wecancodeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewList = new HashMap<>();

    public ReviewRepository() {
        Review aang = new Review(1L, "Aang", "/images/Aang.jpg", "Twinkle Toes", "Airbender", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum id ornare ex. Quisque turpis purus, convallis vitae mi nec, faucibus pellentesque elit. Nam sit amet ante dapibus, pharetra lorem dapibus, tincidunt lacus. Cras imperdiet elementum neque, volutpat sodales ipsum vestibulum quis. Pellentesque quis mauris lacus. Maecenas mattis odio eu hendrerit ultricies. Curabitur luctus convallis est quis fringilla. Proin orci eros, viverra non velit nec, varius molestie erat. Cras eget metus augue. Quisque rutrum odio sit amet est fermentum rhoncus. Donec iaculis risus non augue facilisis semper. Nunc tristique massa porttitor enim hendrerit, id auctor sem lobortis. Ut porta interdum lorem a lobortis. Suspendisse sed scelerisque risus.", "Air Nation", "Katara", "Staff", "Airbending, Waterbending, Firebending, Earthbending, Engerybending", "Avatar State, Bridge between the physical and the spirit World");
        Review katara = new Review(2L, "Katara", "/images/Katara.jpg", "Sugar Queen", "Waterbender", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum id ornare ex. Quisque turpis purus, convallis vitae mi nec, faucibus pellentesque elit. Nam sit amet ante dapibus, pharetra lorem dapibus, tincidunt lacus. Cras imperdiet elementum neque, volutpat sodales ipsum vestibulum quis. Pellentesque quis mauris lacus. Maecenas mattis odio eu hendrerit ultricies. Curabitur luctus convallis est quis fringilla. Proin orci eros, viverra non velit nec, varius molestie erat. Cras eget metus augue. Quisque rutrum odio sit amet est fermentum rhoncus. Donec iaculis risus non augue facilisis semper. Nunc tristique massa porttitor enim hendrerit, id auctor sem lobortis. Ut porta interdum lorem a lobortis. Suspendisse sed scelerisque risus.", "Water Nation, Southern Water Tribe", "Jet, Aang", "Water", "Waterbending", "Water healing");
        Review sokka = new Review(3L, "Sokka", "/images/Sokka.jpg", "Captain Boomerang", "Warrior", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum id ornare ex. Quisque turpis purus, convallis vitae mi nec, faucibus pellentesque elit. Nam sit amet ante dapibus, pharetra lorem dapibus, tincidunt lacus. Cras imperdiet elementum neque, volutpat sodales ipsum vestibulum quis. Pellentesque quis mauris lacus. Maecenas mattis odio eu hendrerit ultricies. Curabitur luctus convallis est quis fringilla. Proin orci eros, viverra non velit nec, varius molestie erat. Cras eget metus augue. Quisque rutrum odio sit amet est fermentum rhoncus. Donec iaculis risus non augue facilisis semper. Nunc tristique massa porttitor enim hendrerit, id auctor sem lobortis. Ut porta interdum lorem a lobortis. Suspendisse sed scelerisque risus.", "Water Nation, Southern Water Tribe", "Yue, Suki", "Boomerang, machete, dagger, sword", "Warrior style, swordsmanship", "Tactician, inventor");
        Review toph = new Review(4L, "Toph Beifong", "/images/Toph.jpg", "The Blind Bandit", "Earthbender", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum id ornare ex. Quisque turpis purus, convallis vitae mi nec, faucibus pellentesque elit. Nam sit amet ante dapibus, pharetra lorem dapibus, tincidunt lacus. Cras imperdiet elementum neque, volutpat sodales ipsum vestibulum quis. Pellentesque quis mauris lacus. Maecenas mattis odio eu hendrerit ultricies. Curabitur luctus convallis est quis fringilla. Proin orci eros, viverra non velit nec, varius molestie erat. Cras eget metus augue. Quisque rutrum odio sit amet est fermentum rhoncus. Donec iaculis risus non augue facilisis semper. Nunc tristique massa porttitor enim hendrerit, id auctor sem lobortis. Ut porta interdum lorem a lobortis. Suspendisse sed scelerisque risus.", "Earth Kingdom", "Sokka", "Earth", "Earthbending, metalbending", "Inventor of metalbending");
        Review suki = new Review(5L, "Suki", "/images/Suki.jpg", "-", "Kyoshi Warrior", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum id ornare ex. Quisque turpis purus, convallis vitae mi nec, faucibus pellentesque elit. Nam sit amet ante dapibus, pharetra lorem dapibus, tincidunt lacus. Cras imperdiet elementum neque, volutpat sodales ipsum vestibulum quis. Pellentesque quis mauris lacus. Maecenas mattis odio eu hendrerit ultricies. Curabitur luctus convallis est quis fringilla. Proin orci eros, viverra non velit nec, varius molestie erat. Cras eget metus augue. Quisque rutrum odio sit amet est fermentum rhoncus. Donec iaculis risus non augue facilisis semper. Nunc tristique massa porttitor enim hendrerit, id auctor sem lobortis. Ut porta interdum lorem a lobortis. Suspendisse sed scelerisque risus.", "Earth Kingdom", "Sokka", "War fans", "Tessenjutsu", "Leader of the Kyoshi Warriors");
        Review zuko = new Review(6L, "Zuko", "/images/Zuko.jpg", "Zuzu", "FireBender", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum id ornare ex. Quisque turpis purus, convallis vitae mi nec, faucibus pellentesque elit. Nam sit amet ante dapibus, pharetra lorem dapibus, tincidunt lacus. Cras imperdiet elementum neque, volutpat sodales ipsum vestibulum quis. Pellentesque quis mauris lacus. Maecenas mattis odio eu hendrerit ultricies. Curabitur luctus convallis est quis fringilla. Proin orci eros, viverra non velit nec, varius molestie erat. Cras eget metus augue. Quisque rutrum odio sit amet est fermentum rhoncus. Donec iaculis risus non augue facilisis semper. Nunc tristique massa porttitor enim hendrerit, id auctor sem lobortis. Ut porta interdum lorem a lobortis. Suspendisse sed scelerisque risus.", "Fire Nation", "Mai", "Fire, broadswords", "Firebending", "Lightning redirection");

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
