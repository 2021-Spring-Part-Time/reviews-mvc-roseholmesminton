package org.wecancodeit.reviews;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ReviewRepositoryTest {

    private ReviewRepository underTest;

    private Review reviewOne = new Review(1L,"title one", "image one", "nickname one", "category one", "content one", "nationality one","love interest one", "weapon of choice one", "fighting styles one", "special skill one");
    private Review reviewTwo = new Review(2L,"title two", "image two", "nickname two", "category two", "content two", "nationality two","love interest two", "weapon of choice two", "fighting styles two", "special skill two");

    @Test
    public void shouldFindReviewOne() {
        underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.findOne(1L);
        assertEquals(reviewOne, foundReview);
    }

    @Test
    public void shouldFindReviewOneAndReviewTwo() {
        underTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review> foundReviews = underTest.findAll();
        assertThat(foundReviews).contains(reviewOne, reviewTwo);
    }

}


