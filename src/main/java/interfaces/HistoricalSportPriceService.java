package interfaces;

import com.example.demo1.HistoricalSportPrice;

import java.util.List;

public interface HistoricalSportPriceService {

    /**
     * Create a new historicalSportPrice
     * @param historicalSportPrice
     */
    void create(HistoricalSportPrice historicalSportPrice) ;

    /**
     * Update an existing historicalSportPrice
     * @param historicalSportPrice
     */
    void update(HistoricalSportPrice historicalSportPrice) ;

    /**
     * soft-delete a historicalSportPrice by setting its isActive flag to false
     * @param historicalSportPrice
     */
    void delete(HistoricalSportPrice historicalSportPrice) ;

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
