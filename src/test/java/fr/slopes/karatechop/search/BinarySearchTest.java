package fr.slopes.karatechop.search;

import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class BinarySearchTest {

    private BinarySearch binarySearch;

    public BinarySearchTest (Class<? extends BinarySearch> implementation) throws IllegalAccessException, InstantiationException {
        binarySearch = implementation.newInstance();
    }
    @Test
    public void should_return_index_of_element_if_element_is_in_ordered_array () {
        //Given
        int[] elements = {1, 2, 3, 4};

        //When
        Integer result = binarySearch.search(2, elements);

        //Then
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void should_return_index_of_element_if_element_is_first_in_ordered_array () {
        //Given
        int[] elements = {1, 2, 3, 4};

        //When
        Integer result = binarySearch.search(1, elements);

        //Then
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void should_return_negative_one_value_if_search_on_empty_array () {
        //Given
        int[] elements = {};

        //When
        Integer result = binarySearch.search(2, elements);

        //Then
        assertThat(result).isEqualTo(-1);
    }

    @Test
    public void should_return_negative_one_value_if_value_is_absent_from_array () {
        //Given
        int[] elements = {0,1,2,3,4};

        //When
        Integer result = binarySearch.search(5, elements);

        //Then
        assertThat(result).isEqualTo(-1);
    }

    @Parameters(name = "{0} implementation")
    public static List<Class<? extends BinarySearch>> searchImplementations () {
        return Lists.newArrayList(
                IterativeSearch.class,
                FunctionalSearch.class,
                SplitSearch.class
        );
    }

}