package com.project.demo.rest.math;

import com.project.demo.logic.entity.math.Math;
import com.project.demo.logic.entity.math.MathRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/math")
public class MathRestController {
    @Autowired
    private MathRepository mathRepository;


    @GetMapping

    public List<Math> getAllBadges() {
        return  mathRepository.findAll();
    }

    @PostMapping

    public Math addBadge(@RequestBody Math math) {
        return mathRepository.save(math);
    }
    @PostMapping("/math")

    public List<Math> addElementEs(@RequestBody List<Math> math) {
        return mathRepository.saveAll(math);
    }

    @GetMapping("/{id}")
    public Optional<Math> getBadgeById(@PathVariable Long id) {
        return mathRepository.findById(id);
    }


//    @PutMapping("/{badgeId}/{moduleId}")
//    @PreAuthorize("hasAnyRole('ADMIN', 'SUPER_ADMIN')")
//    public Math updateBadge(@PathVariable Long badgeId, @PathVariable Long moduleId, @RequestBody Math math) {
//        Optional<ModuleE> moduleE = moduleERestController.getModuleEById(moduleId);
//        if (moduleE.isPresent()) {
//            math.setModule(moduleE.get());
//            return mathRepository.findById(badgeId)
//                    .map(existingMath -> {
//                        existingMath.setModule(math.getModule());
//                        existingMath.setName(math.getName());
//                        existingMath.setDescription(math.getDescription());
//                        return mathRepository.save(existingMath);
//                    })
//                    .orElseGet(() -> {
//                        math.setId(badgeId);
//                        return mathRepository.save(math);
//                    });
//        } else {
//            // Handle the case where the module is not found
//            throw new EntityNotFoundException("Module not found with id " + moduleId);
//        }
//    }
//
//
//    @DeleteMapping("/{id}")
//    @PreAuthorize("hasAnyRole('ADMIN', 'SUPER_ADMIN')")
//    public void deleteBadge (@PathVariable Long id) {
//        mathRepository.deleteById(id);
//    }
}
