This repository provides the implementation of the BPMN extension proposed in the paper *"Towards Modeling Human-Agentic Collaborative Workflows: A BPMN Extension"*, submitted to the International Conference on Advanced Information Systems Engineering (CAiSE) 2025.

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

Right-click on lu.uni.snt.besser.bpmn-agentic and click "Run As... > Eclipse Application". 
This will open a nested ("runtime") Eclipse, into which we import only lu.uni.snt.besser.bpmn-agentic by clicking on the "File > Import" menu item and selecting "General > Existing Projects into Workspace" unticking the other projects.

The representation of the running example is in the `model` folder.
In the "Model explorer" view expand the `model` folder, then select the `representation.aird` file.
In the "Representations" list expand the "BPD" and double-click on "Running Example".
Then, the running example should be displayed as in the following screenshot:

![aconite-example](https://github.com/user-attachments/assets/d33ce55f-ac98-4a77-96bc-2f6ca1b1ee8b)

