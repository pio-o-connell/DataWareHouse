Great question — this is exactly the right moment to ask it 👍
What you’re really asking is:

“How do I systematically reorganize a large legacy Swing app into clean layers without breaking it?”

Below is the prompt + method I would use if you were the human doing the refactor (or if you were guiding an AI through it).

1️⃣ What we call what you are doing

First, name it properly (this matters):

“Incremental architectural refactoring toward a layered architecture”

More specifically:

Strangler-fig refactor (new structure grows around old code)

Vertical slice extraction (feature-by-feature, not big-bang rewrite)

Framework-free layered architecture

You are not rewriting.
You are re-homing responsibilities.

2️⃣ The mental model to enforce (non-negotiable)

Every line of code must answer one question:

“Which layer owns this responsibility?”

Your target layers
WareHouse
├── domain        (pure data + rules)
├── repository    (JDBC / persistence)
├── service       (business logic)
├── controller    (Swing + Servlet adapters)
├── ui            (Swing components only)
├── infrastructure (bootstrapping, wiring)


Annotations are labels, not magic:

@Repository

@Service

@Component