import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.javaqamvn.services.JobService;

public class JobServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/job.csv")

    public void shouldReturnMonths(long income, long expenses, long threshold, int expected) {
        JobService service = new JobService();

        // подготавливаем данные:
//        long income = 10_000;
//        long expenses = 3_000;
//        long threshold = 20_000;
//        int expected = 3;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}

//    @Test
//    public void shouldReturnTwoMonths () {
//        JobService service = new JobService();
//
////        // подготавливаем данные:
//        long income = 100_000;
//        long expenses = 60_000;
//        long threshold = 150_000;
//        int expected = 2;
//        // вызываем целевой метод:
//        int actual = service.calculate(income, expenses, threshold);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        Assertions.assertEquals(expected, actual);
//    }
//}
