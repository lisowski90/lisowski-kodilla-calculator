package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("1");
        Product product1 = new Product("2");
        Product product2 = new Product("3");

        Item item = new Item(new BigDecimal(150), 5, new BigDecimal(750));
        Item item1 = new Item(new BigDecimal(280), 4, new BigDecimal(1120));
        Item item2 = new Item(new BigDecimal(150), 12, new BigDecimal(1800));
        Item item3 = new Item(new BigDecimal(1400), 1, new BigDecimal(1400));

        item.setProduct(product);
        item1.setProduct(product1);
        item2.setProduct(product1);
        item3.setProduct(product2);

        Invoice invoice = new Invoice("01/01/20");

        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        item.setInvoice(invoice);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        //When
        productDao.save(product);
        productDao.save(product1);
        productDao.save(product2);
        invoiceDao.save(invoice);
        int id = invoice.getId();


        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
    }
}
