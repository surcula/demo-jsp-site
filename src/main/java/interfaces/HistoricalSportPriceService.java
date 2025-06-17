package interfaces;

import com.example.demo1.HistoricalSportPrice;

import java.util.List;

public interface HistoricalSportPriceService {


    /**
     * retrieves a historicalSportPrice by its Id
     * @param id
     * @return
     */
    HistoricalSportPrice getOneById(int id);

    /**
     * retrieves all historicalSportPrices
     * @return a list of all historicalSportPrices
     */
    List<HistoricalSportPrice> getAllHistoricalSportPrices() ;
}
