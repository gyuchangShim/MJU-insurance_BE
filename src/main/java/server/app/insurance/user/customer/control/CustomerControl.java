package server.app.insurance.user.customer.control;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import server.app.insurance.user.customer.service.CustomerList;
import server.app.insurance.user.employee.dto.ContractDto;
import server.app.insurance.user.employee.service.ContractList;
import server.app.insurance.user.customer.dto.CustomerDto;

import java.util.List;

@Tag(name = "Customer 컨트롤러", description = "Customer API입니다.")
@RestController
@RequiredArgsConstructor
public class CustomerControl {
    private final CustomerList customerList;
    private final ContractList contractList;

    @PostMapping("/customer/registerInsurance")
    public void registerInsurance(@RequestBody ContractDto contractDto) {
        contractList.registerInsurance(contractDto);
    }

    @PostMapping("/customer")
    public void add(@RequestBody CustomerDto request) {customerList.add(request);}
    @GetMapping("/customer")
    public CustomerDto retrieve(@RequestParam String name) {return customerList.retrieve(name);}
    @GetMapping("/customer/getAll")
    public List<CustomerDto> retrieveAll() {return customerList.retrieveAll();}
}