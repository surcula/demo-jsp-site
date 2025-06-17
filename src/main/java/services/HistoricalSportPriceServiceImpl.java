package services;

import com.example.demo1.HistoricalSportPrice;
import interfaces.HistoricalSportPriceService;

import javax.persistence.EntityManager;
import java.util.Collections;
import java.util.List;

public class HistoricalSportPriceServiceImpl implements HistoricalSportPriceService {
    private EntityManager em;

    public HistoricalSportPriceServiceImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void create(HistoricalSportPrice historicalSportPrice) {

    }

    @Override
    public void update(HistoricalSportPrice historicalSportPrice) {

    }

    @Override
    public void delete(HistoricalSportPrice historicalSportPrice) {

    }

    @Override
    public HistoricalSportPrice getOneById(int id) {
        return null;
    }

    @Override
    public List<HistoricalSportPrice> getAllHistoricalSportPrices() {
        return Collections.emptyList();
    }
}
