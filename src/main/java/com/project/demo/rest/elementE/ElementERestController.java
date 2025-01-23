package com.project.demo.rest.elementE;

import com.project.demo.logic.entity.elementE.ElementE;
import com.project.demo.logic.entity.elementE.ElementERepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/elementEs")
public class ElementERestController {
    @Autowired
    private ElementERepository elementERepository;

    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'SUPER_ADMIN', 'USER')")
    public List<ElementE> getAllElementEs() {
        return elementERepository.findAll();
    }

    @PostMapping
    @PreAuthorize("hasAnyRole('ADMIN', 'SUPER_ADMIN')")
    public ElementE addElementE(@RequestBody ElementE elementE) {
        return elementERepository.save(elementE);
    }

    @PostMapping("/batch")
    @PreAuthorize("hasAnyRole('ADMIN', 'SUPER_ADMIN')")
    public List<ElementE> addElementEs(@RequestBody List<ElementE> elements) {
        return elementERepository.saveAll(elements);
    }

    @GetMapping("/{id}")
    public Optional<ElementE> getElementEById(@PathVariable Long id) {
        return elementERepository.findById(id);
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN', 'SUPER_ADMIN')")
    public ElementE updateElementE(@PathVariable Long id, @RequestBody ElementE elementE) {
        return elementERepository.findById(id)
                .map(existingElementE -> {
                    existingElementE.setName(elementE.getName());
                    existingElementE.setDescription(elementE.getDescription());
                    existingElementE.setAtomicNumber(elementE.getAtomicNumber());
                    existingElementE.setSymbol(elementE.getSymbol());
                    existingElementE.setGroup(elementE.getGroup());
                    existingElementE.setPeriod(elementE.getPeriod());
                    existingElementE.setBlock(elementE.getBlock());
                    existingElementE.setSeries(elementE.getSeries());
                    existingElementE.setDiscover(elementE.getDiscover());
                    existingElementE.setDiscoveredBy(elementE.getDiscoveredBy());
                    existingElementE.setImage(elementE.getImage());
                    existingElementE.setSource(elementE.getSource());
                    existingElementE.setProton(elementE.getProton());
                    existingElementE.setNeutron(elementE.getNeutron());
                    existingElementE.setElectron(elementE.getElectron());
                    return elementERepository.save(existingElementE);
                })
                .orElseGet(() -> {
                    elementE.setAtomicNumber(id);
                    return elementERepository.save(elementE);
                });
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAnyRole('ADMIN', 'SUPER_ADMIN')")
    public void deleteElementE(@PathVariable Long id) {
        elementERepository.deleteById(id);
    }
}
