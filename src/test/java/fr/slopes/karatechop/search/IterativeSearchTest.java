package fr.slopes.karatechop.search;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IterativeSearchTest {
    @Test
    public void should_return_index_of_element_if_element_is_in_ordered_array () {
        //Given
        BinarySearch binarySearch = new IterativeSearch();
        int[] elements = {1, 2, 3, 4};

        //When
        Integer result = binarySearch.search(2, elements);

        //Then
        assertThat(result).isEqualTo(1);
    }

}