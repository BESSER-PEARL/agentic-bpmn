This repository provides the implementation of the BPMN extension proposed in the paper *"Towards Modeling Human-Agentic Collaborative Workflows: A BPMN Extension"*, accepted in the Euromicro Conference Series on Software Engineering and Advanced Applications (SEAA) 2025.

# Contents

## `extension` folder

Folder `extension` contains the Eclipse project defining the BPMN extension using [Aconite](https://github.com/nwxrichardson/aconite).
Aconite is a tool that generates graphical modelling notations from an annotated Ecore metamodel.
The requirements to run the code are:

* [Eclipse Modeling Tools](https://www.eclipse.org/downloads/packages/) 2024-09 or newer
* Java 17+
* [Eclipse Epsilon](https://eclipse.dev/epsilon/) 2.5.0+
* [Eclipse Emfatic](https://eclipse.dev/emfatic/) 1.1+
* [Eclipse Sirius](https://eclipse.dev/sirius/) 7.x

To run the tool, set up the Eclipse IDE following [this instructions](https://github.com/nwxrichardson/aconite?tab=readme-ov-file#setting-up-the-eclipse-ide).
Then clone the repository and import the project in the `extension` folder into your Eclipse workspace, by clicking on the "File > Import" menu item and selecting "General > Existing Projects into Workspace". 
Find the downloaded subdirectory and import these four projects:

* lu.uni.snt.besser.bpmn-agentic
* lu.uni.snt.besser.bpmn-agentic.edit
* lu.uni.snt.besser.bpmn-agentic.editor
* lu.uni.snt.besser.bpmn-agentic.tests

Right-click on `lu.uni.snt.besser.bpmn-agentic` and click "Run As... > Eclipse Application". 
This will open a nested ("runtime") Eclipse, into which we import only lu.uni.snt.besser.bpmn-agentic by clicking on the "File > Import" menu item and selecting "General > Existing Projects into Workspace" unticking the other projects.

The representation of the running example is in the `model` [folder](https://github.com/BESSER-PEARL/agentic-bpmn/tree/main/extension/lu.uni.snt.besser.bpmn-agentic/model).
In the "Model explorer" view expand the `model` folder, then select the `representation.aird` file to visualize the contents of the model.
In the "Representations" list expand the "BPD" and double-click on "Running Example" to show the representation for the model.
The running example should be displayed as in the following screenshot:

![aconite-example](https://github.com/user-attachments/assets/d33ce55f-ac98-4a77-96bc-2f6ca1b1ee8b)

### Further examples

We have used our extension to model several human-agent examples found in the literature. 
These are also provided in the `model` [folder](https://github.com/BESSER-PEARL/agentic-bpmn/tree/main/extension/lu.uni.snt.besser.bpmn-agentic/model), shared also as an image (.jpg) for accessibility purposes.

These examples address the need found in the literature for our extension, specifically:
* [Self-collaboration Code Generation via ChatGPT](https://arxiv.org/pdf/2304.07590): This paper proposes several instances of ChatGPT to simulate a waterfall development process of code, having a requirements analyst, a coder and a tester agent. We used our extension to represent the workflow defined in their self-collaboration framework (example [here](https://github.com/BESSER-PEARL/agentic-bpmn/blob/main/extension/lu.uni.snt.besser.bpmn-agentic/model/self-collaboration.jpg)).
* [Multi-Agent Collaboration Mechanisms: A Survey of LLMs](https://arxiv.org/abs/2501.06322): In Section 5.2, the authors show one of the applications of agent collaboration (A customer service, focused on Q&A). However, they do not use any standard notation to display the workflow. Thus, we used our extension to model the example, introducing human reflection for the Q&A where the agents need the user input (example [here](https://github.com/BESSER-PEARL/agentic-bpmn/blob/main/extension/lu.uni.snt.besser.bpmn-agentic/model/Mult-Agent-collaboration.jpg)).

Additionally, to showcase different collaboration scenarios we provide toy examples for competition, debate-, and role-based cooperation.
These toy examples are also available in the `model` [folder](https://github.com/BESSER-PEARL/agentic-bpmn/tree/main/extension/lu.uni.snt.besser.bpmn-agentic/model) as an image (.jpg), or can be selected via the `representation.aird` file commented before. 

The scenarios showcase three different ways to generate code from user request:
* [`Toy_competition`](https://github.com/BESSER-PEARL/agentic-bpmn/blob/main/extension/lu.uni.snt.besser.bpmn-agentic/model/Toy_competition.jpg): We set two agents to compete and obtain the code from the agent that finish fastest.
* [`Toy_debate`](https://github.com/BESSER-PEARL/agentic-bpmn/blob/main/extension/lu.uni.snt.besser.bpmn-agentic/model/Toy_debate.jpg): We set two agents to generate the code, and let them debate and decide by majority the code that is provided to the user.
* [`Toy_role`](https://github.com/BESSER-PEARL/agentic-bpmn/blob/main/extension/lu.uni.snt.besser.bpmn-agentic/model/Toy_role.jpg): We set three agents to portray three different roles (i.e., requirements engineer, coder, and tester). The solution is a composed output from the three agents.

