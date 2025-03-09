import random
import numpy as np

# Función de fitness de ejemplo
def fitness_function(individual):
    # Esta es solo una función de ejemplo, reemplázala con tu función de fitness
    return sum(individual)

# Función de selección por ruleta
def selection_roulette(population, fitness_values):
    selected = []
    total_fitness = sum(fitness_values)
    probabilities = [fit / total_fitness for fit in fitness_values]
    for _ in range(len(population)):
        selected_individual = random.choices(population, probabilities)[0]
        selected.append(selected_individual)
    return selected

# Función de cruce uniforme
def crossover_uniform(parent1, parent2):
    child = []
    for gene1, gene2 in zip(parent1, parent2):
        if random.random() < 0.5:
            child.append(gene1)
        else:
            child.append(gene2)
    return child

# Función de mutación uniforme
def mutation_uniform(individual, mutation_rate):
    mutated_individual = []
    for gene in individual:
        if random.random() < mutation_rate:
            mutated_individual.append(random.random())
        else:
            mutated_individual.append(gene)
    return mutated_individual

# Función principal del algoritmo genético
def genetic_algorithm(population_size, chromosome_length, generations, selection_func, crossover_func, mutation_func, fitness_func, mutation_rate=0.1):
    population = [[random.random() for _ in range(chromosome_length)] for _ in range(population_size)]
    
    for generation in range(generations):
        fitness_values = [fitness_func(individual) for individual in population]
        
        # Seleccionar individuos
        selected_population = selection_func(population, fitness_values)
        
        # Realizar el cruce y la mutación
        new_population = []
        for _ in range(population_size // 2):
            parent1, parent2 = random.sample(selected_population, 2)
            child1 = crossover_func(parent1, parent2)
            child2 = crossover_func(parent1, parent2)
            child1 = mutation_func(child1, mutation_rate)
            child2 = mutation_func(child2, mutation_rate)
            new_population.extend([child1, child2])
        
        population = new_population
    
    best_individual = max(population, key=fitness_func)
    best_fitness = fitness_func(best_individual)
    
    return best_individual, best_fitness

# Ejemplo de uso
if __name__ == "__main__":
    population_size = 100
    chromosome_length = 5
    generations = 100
    mutation_rate = 0.1

    best_individual, best_fitness = genetic_algorithm(population_size, chromosome_length, generations, selection_roulette, crossover_uniform, mutation_uniform, fitness_function, mutation_rate)

    print("Mejor individuo:", best_individual)
    print("Mejor fitness:", best_fitness)
