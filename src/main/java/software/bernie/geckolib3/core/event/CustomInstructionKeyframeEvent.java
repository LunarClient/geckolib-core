/*
 * Copyright (c) 2020.
 * Author: Bernie G. (Gecko)
 */

package software.bernie.geckolib3.core.event;

import com.eliotlash.molang.ast.Evaluatable;
import com.eliotlash.molang.variables.ExecutionContext;
import software.bernie.geckolib3.core.controller.AnimationController;

public class CustomInstructionKeyframeEvent<T> extends KeyframeEvent<T>
{
	public final Evaluatable molang;

	/**
	 * This stores all the fields that are needed in the AnimationTestEvent
	 *
	 * @param entity        the entity
	 * @param animationTick The amount of ticks that have passed in either the current transition or animation, depending on the controller's AnimationState.
	 * @param controller    the controller
	 */
	public CustomInstructionKeyframeEvent(T entity, double animationTick, Evaluatable molang, AnimationController controller, ExecutionContext context)
	{
		super(entity, animationTick, controller, context);
		this.molang = molang;
	}
}
