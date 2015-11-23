package sylvester;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.Test;

import optionals.Car;
import optionals.Person;

public class OptionalsTest {

    @Test
    public void thatOptionIsPresent() throws Exception {
        final Person person = new Person(new Car());
        final Optional<Car> car = Optional.ofNullable(person).map(Person::getCar);

        assertTrue(car.isPresent());
    }

    @Test
    public void thatCarIsNotPresent() throws Exception {
        final Person person = new Person(null);
        final Optional<Car> car = Optional.ofNullable(person).map(Person::getCar);

        assertFalse(car.isPresent());
    }
}
