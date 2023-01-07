package oops.Assignment.Discount.Service;

import oops.Assignment.Discount.Customer;
import oops.Assignment.Discount.NameGenerator;
import oops.Assignment.Discount.OrderCountGenerator;
import oops.Assignment.Discount.VisitCountGenerator;

import java.util.UUID;

public class CustomerService {
    private static  final int LIMIT = 100;
        public Customer[] getAllCustomer(){
            Customer[] customers = new Customer[LIMIT];
            for(int i = 0; i<LIMIT; i++){
                Customer customer = buildCustomer();
                customers[0] = customer;

            }
            return customers;

        }
        private Customer buildCustomer(){
            Customer customer = new Customer();
            customer.setId(UUID.randomUUID());
            customer.setName(NameGenerator.getName());
            customer.setOrderCount(OrderCountGenerator.getOrderCount());
            customer.setVistCount(VisitCountGenerator.getVisitCount());
            return customer;
        }

    public Customer[] getAllCustomers() {
    }
}
