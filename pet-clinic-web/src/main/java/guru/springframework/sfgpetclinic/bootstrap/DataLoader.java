package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.*;
import guru.springframework.sfgpetclinic.services.*;
import guru.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import guru.springframework.sfgpetclinic.services.map.VetServiceMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Slf4j
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final PetService petService;
    private final SpecialityService specialityService;
    private final VisitService visitService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
                      PetService petService, SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.petService = petService;
        this.specialityService = specialityService;
        this.visitService = visitService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if(count == 0)
            loadData();
    }

    private void loadData() {
        log.info("loading data..");
        PetType petType = new PetType();
        petType.setName("dog");
        petTypeService.save(petType);

        PetType petType2 = new PetType();
        petType2.setName("cat");
        petTypeService.save(petType2);

        Owner owner1 = new Owner();
//        owner1.setId(1l);
        owner1.setFirstName("Teo");
        owner1.setLastName("Miu");
        owner1.setAddress("address1");
        owner1.setCity("bucharest");
        owner1.setTelephone("12345");
        ownerService.save(owner1);

        Pet pet = new Pet();
        pet.setPetType(petType);
        pet.setOwner(owner1);
        pet.setBirthDate(LocalDate.of(2013,07,01));
        pet.setName("Axy");
        petService.save(pet);
        owner1.getPets().add(pet);

        Visit visit = new Visit();
        visit.setPet(pet);
        visit.setDate(LocalDate.now());
        visit.setDescription("a description");
        visitService.save(visit);




        Owner owner2 = new Owner();
//        owner2.setId(2l);
        owner2.setFirstName("Ionela");
        owner2.setLastName("Pavel");
        owner2.setAddress("address2");
        owner2.setCity("bucharest");
        owner2.setTelephone("12341");
        ownerService.save(owner2);

        Owner owner3 = new Owner();
//        owner3.setId(3l);
        owner3.setFirstName("Axy");
        owner3.setLastName("Miu");
        owner3.setAddress("address3");
        owner3.setCity("bucharest");
        owner3.setTelephone("12343");
        ownerService.save(owner3);

        Speciality speciality = new Speciality();
        speciality.setDescription("radiology");
        specialityService.save(speciality);

        Speciality speciality2 = new Speciality();
        speciality2.setDescription("surgery");
        specialityService.save(speciality2);

        Speciality speciality3 = new Speciality();
        speciality3.setDescription("dentistry");
        specialityService.save(speciality3);

        Vet vet1 = new Vet();
//        vet1.setId(1L);
        vet1.setFirstName("vet1FirstName");
        vet1.setLastName("vet1LastName");
        vet1.getSpecialities().add(speciality);
        vet1.getSpecialities().add(speciality2);
        vetService.save(vet1);

        Vet vet2 = new Vet();
//        vet2.setId(2L);
        vet2.getSpecialities().add(speciality3);
        vet2.setFirstName("vet2FirstName");
        vet2.setLastName("vet2LastName");
        vetService.save(vet2);
        log.info("done initializating");
    }
}
