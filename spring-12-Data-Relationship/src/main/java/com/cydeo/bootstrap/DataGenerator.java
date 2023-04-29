package com.cydeo.bootstrap;

import com.cydeo.entity.*;
import com.cydeo.enums.Status;
import com.cydeo.repository.CartReposirtory;
import com.cydeo.repository.ItemRepository;
import com.cydeo.repository.MerchantRepository;
import com.cydeo.repository.PaymentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

@Component
public class DataGenerator implements CommandLineRunner {

    private final PaymentRepository paymentRepository;
    private final MerchantRepository merchantRepository;
    private final ItemRepository itemRepository;
    private final CartReposirtory cartReposirtory;

    public DataGenerator(PaymentRepository paymentRepository, MerchantRepository merchantRepository, ItemRepository itemRepository, CartReposirtory cartReposirtory) {
        this.paymentRepository = paymentRepository;
        this.merchantRepository = merchantRepository;
        this.itemRepository = itemRepository;
        this.cartReposirtory = cartReposirtory;
    }

    @Override
    public void run(String... args) throws Exception {


        Payment p1 = new Payment(LocalDate.of(2022,4,19), new BigDecimal("150000"), Status.SUCCESS);
        PaymentDetail pd1 = new PaymentDetail(new BigDecimal("140000"), new BigDecimal("1000"), LocalDate.of(2022, 4 , 19));
        p1.setPaymentDetail(pd1);


        Payment p2 = new Payment(LocalDate.of(2022,4,25), new BigDecimal("100000"), Status.FAIL);
        PaymentDetail pd2 = new PaymentDetail(new BigDecimal("90000"), new BigDecimal("5000"), LocalDate.of(2022, 4 , 25));
        p2.setPaymentDetail(pd2);

        Merchant mer1 = new Merchant("Amazon", "M123", new BigDecimal("0.25"), new BigDecimal("3"), 30, p1);




        //paymentRepository.delete(p1);

        Item it1 = new Item("Milk", "M01");
        Item it2 = new Item("Sugar", "S01");
        Item it3 = new Item("Bread", "B01");


        Cart cart1 = new Cart();
        Cart cart2 = new Cart();

        cart1.setItemsList(Arrays.asList(it1,it2,it3));
        cart2.setItemsList(Arrays.asList(it1,it2));

        itemRepository.save(it1);
        itemRepository.save(it2);
        itemRepository.save(it3);
        cartReposirtory.save(cart1);
        cartReposirtory.save(cart2);




        merchantRepository.save(mer1);
        paymentRepository.save(p1);
        paymentRepository.save(p2);
    }
}
